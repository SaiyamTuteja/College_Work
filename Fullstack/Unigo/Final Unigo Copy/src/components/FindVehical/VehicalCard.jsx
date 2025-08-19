import React from "react";
import { FaStar, FaUser } from "react-icons/fa";
import carImage from "../../assets/bg1.png";

const VehicalCard = ({ searchHistory, availableRides, onClick }) => {
  // Format the date from form input
  const formatDate = (dateString) => {
    if (!dateString) return "Today";

    // Convert the form input date to a readable format
    const date = new Date(dateString);
    const today = new Date();

    // If selected date is today, show "Today"
    if (date.toDateString() === today.toDateString()) {
      return "Today";
    }

    // Otherwise show the formatted date
    return date.toLocaleDateString("en-US", {
      weekday: "short",
      day: "numeric",
      month: "short",
    });
  };

  return (
    <div
      onClick={onClick}
      className="bg-white rounded-lg shadow-md p-4 cursor-pointer hover:shadow-lg transition-shadow"
    >
      <div className="flex items-start gap-4">
        <div className="w-24 h-24 flex-shrink-0">
          <img
            src={carImage}
            alt="Vehicle"
            className="w-full h-full object-cover rounded-lg"
          />
        </div>

        <div className="flex-1 space-y-2">
          <div className="flex justify-between items-start">
            <div>
              <h3 className="font-semibold text-lg">Saiyam Tuteja</h3>
              <div className="flex items-center gap-1 text-sm text-gray-600">
                <FaStar className="text-yellow-400" />
                <span>4.5/5 - 13 ratings</span>
              </div>
            </div>
            <span className="text-lg font-bold text-purple-600">₹500</span>
          </div>

          <div className="flex items-center gap-2 text-sm text-gray-600">
            <FaUser className="text-xs" />
            <span>8.7 km from your departure</span>
          </div>

          <div className="text-sm text-gray-700">
            <span>Aviator New • </span>
            <span>White</span>
          </div>
        </div>
      </div>
    </div>
  );
};

export default VehicalCard;
