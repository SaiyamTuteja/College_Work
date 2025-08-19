import React, { useState, useRef, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import logo from "../../assets/logo.png";
import homeImg from "../../assets/homeimg.png";

function HomePage() {
  const navigate = useNavigate();
  const [isMenuOpen, setIsMenuOpen] = useState(false);
  const menuRef = useRef(null);

  useEffect(() => {
    function handleClickOutside(event) {
      if (menuRef.current && !menuRef.current.contains(event.target)) {
        setIsMenuOpen(false);
      }
    }

    document.addEventListener("mousedown", handleClickOutside);

    return () => {
      document.removeEventListener("mousedown", handleClickOutside);
    };
  }, []);

  const handleScheduleRide = () => {
    navigate("/search-destination");
  };

  const handleGetRideNow = () => {
    navigate("/search-destination");
  };

  const menuItems = [
    { label: "Your rides", path: "/booking-history", icon: "🚗" },
    { label: "Publish", path: "/publish", icon: "➕" },
    { label: "Inbox", path: "/inbox", icon: "💬" },
    { label: "Profile", path: "/profile", icon: "👤" },
  ];

  return (
    <div className="flex flex-col items-center min-h-screen bg-white">
      {/* Navigation Bar */}
      <nav className="w-full bg-gray-50 fixed bottom-0 md:top-0 md:bottom-auto z-50">
        {/* Mobile Menu */}
        <div className="md:hidden flex justify-around items-center p-3">
          {menuItems.map((item) => (
            <button
              key={item.path}
              onClick={() => navigate(item.path)}
              className="flex flex-col cursor-pointer items-center space-y-1"
            >
              <span className="text-xl">{item.icon}</span>
              <span className="text-xs text-gray-600">{item.label}</span>
            </button>
          ))}
        </div>

        {/* Desktop Menu */}
        <div className="hidden md:flex justify-between items-center max-w-6xl mx-auto px-6 py-4">
          <div className="flex items-center relative" ref={menuRef}>
            {/* Hamburger Button */}
            <button
              onClick={() => setIsMenuOpen(!isMenuOpen)}
              className="p-2 hover:bg-gray-100 rounded-lg cursor-pointer"
            >
              <div className="space-y-1.5">
                <div className="w-6 h-0.5 bg-gray-600"></div>
                <div className="w-6 h-0.5 bg-gray-600"></div>
                <div className="w-6 h-0.5 bg-gray-600"></div>
              </div>
            </button>

            {/* Dropdown Menu */}
            {isMenuOpen && (
              <div className="absolute left-0 top-full mt-2 w-64 bg-white shadow-lg rounded-lg py-2 z-50">
                {menuItems.map((item) => (
                  <button
                    key={item.path}
                    onClick={() => {
                      navigate(item.path);
                      setIsMenuOpen(false);
                    }}
                    className="w-full px-4 py-2 text-left hover:bg-gray-100 cursor-pointer flex items-center space-x-3"
                  >
                    <span className="text-xl">{item.icon}</span>
                    <span>{item.label}</span>
                  </button>
                ))}
              </div>
            )}
          </div>

          <img
            src={logo}
            alt="UniGo Logo"
            className="w-24 h-auto cursor-pointer"
            onClick={() => navigate("/")}
          />
        </div>
      </nav>

      {/* Main Content */}
      <div className="flex-1 flex flex-col items-center w-full max-w-6xl mx-auto px-4 pt-20 pb-24 md:pt-32 md:pb-20">
        <div className="flex-1 flex items-center justify-center my-10">
          <img
            src={homeImg}
            alt="Rider Illustration"
            className="max-w-[80%] h-auto"
          />
        </div>

        <div className="w-full max-w-md mb-10 space-y-4">
          <button
            className="w-full py-4 px-6 bg-purple-800 text-white rounded-lg text-lg font-medium transition transform active:scale-95 hover:opacity-90"
            onClick={handleScheduleRide}
          >
            Schedule Your Ride
          </button>

          <button
            className="w-full py-4 px-6 bg-purple-800 text-white rounded-lg text-lg font-medium transition transform active:scale-95 hover:opacity-90"
            onClick={handleGetRideNow}
          >
            Get Your Ride Now
          </button>
        </div>
      </div>
    </div>
  );
}

export default HomePage;
