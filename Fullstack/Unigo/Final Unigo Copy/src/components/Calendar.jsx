import React, { useState } from "react";

const Calendar = ({ selectedDate, onDateSelect, onClose }) => {
  const [tempDate, setTempDate] = useState(null);
  const currentDate = new Date();
  const currentMonth = currentDate.getMonth();
  const currentYear = currentDate.getFullYear();
  const currentDay = currentDate.getDate();

  const daysInMonth = new Date(currentYear, currentMonth + 1, 0).getDate();
  const firstDayOfMonth = new Date(currentYear, currentMonth, 1).getDay();

  const days = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
  const months = [
    "January",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December",
  ];

  const handleDateClick = (day) => {
    const newDate = new Date(currentYear, currentMonth, day);
    setTempDate(newDate.toISOString());
  };

  const getSelectedDay = () => {
    if (!selectedDate) return null;
    const date = new Date(selectedDate);
    return date.getDate();
  };

  const handleSearchClick = () => {
    if (tempDate) {
      onDateSelect(tempDate);
    }
  };

  return (
    <div className="absolute left-[calc(100%+1rem)] top-0 bg-white rounded-lg shadow-lg p-4 z-50 w-[320px]">
      {/* Month Header */}
      <div className="flex justify-between items-center mb-4">
        <h2 className="text-xl font-semibold text-purple-800">
          {months[currentMonth]}
        </h2>
      </div>

      {/* Days Header */}
      <div className="grid grid-cols-7 gap-1 mb-2">
        {days.map((day) => (
          <div key={day} className="text-center text-purple-800 font-medium">
            {day}
          </div>
        ))}
      </div>

      {/* Calendar Grid */}
      <div className="grid grid-cols-7 gap-1">
        {[...Array(firstDayOfMonth)].map((_, index) => (
          <div key={`empty-${index}`} className="h-10" />
        ))}
        {[...Array(daysInMonth)].map((_, index) => {
          const day = index + 1;
          const isToday = day === currentDay;
          const isSelected = day === getSelectedDay();
          const isPast =
            new Date(currentYear, currentMonth, day) <
            new Date(currentYear, currentMonth, currentDay);

          return (
            <button
              key={day}
              onClick={() => !isPast && handleDateClick(day)}
              disabled={isPast}
              className={`
                h-10 rounded-full flex items-center justify-center
                ${
                  isPast
                    ? "text-gray-300 cursor-not-allowed"
                    : "hover:bg-purple-50"
                }
                ${isToday ? "bg-purple-50 text-purple-800 font-semibold" : ""}
                ${isSelected ? "bg-purple-400 text-white" : ""}
              `}
            >
              {day}
            </button>
          );
        })}
      </div>

      {/* Search Button */}
      {/* <div className="mt-4">
        <button
          onClick={handleSearchClick}
          className="w-full bg-purple-600 text-white py-2 rounded"
        >
          Search
        </button>
      </div> */}
    </div>
  );
};

export default Calendar;
