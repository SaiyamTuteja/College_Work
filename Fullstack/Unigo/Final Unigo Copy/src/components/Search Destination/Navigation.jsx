import React, { useState, useRef, useEffect } from "react";
// import "tailwindcss";
import { LuCirclePlus } from "react-icons/lu";
import { FaUserCircle } from "react-icons/fa";
const Navigation = () => {
  const [isDropdownOpen, setIsDropdownOpen] = useState(false);
  const dropdownRef = useRef(null); // Reference to the dropdown menu
  const accountButtonRef = useRef(null); // Reference to the account button

  const toggleDropdown = () => {
    setIsDropdownOpen((prev) => !prev);
  };

  const closeDropdown = () => {
    setIsDropdownOpen(false);
  };

  useEffect(() => {
    // Function to handle clicks outside of the dropdown or account button
    const handleClickOutside = (event) => {
      if (
        dropdownRef.current &&
        !dropdownRef.current.contains(event.target) &&
        accountButtonRef.current &&
        !accountButtonRef.current.contains(event.target)
      ) {
        setIsDropdownOpen(false);
      }
    };

    // Add event listener for clicks outside the dropdown and account button
    document.addEventListener("mousedown", handleClickOutside);

    // Cleanup listener on component unmount
    return () => {
      document.removeEventListener("mousedown", handleClickOutside);
    };
  }, []);

  return (
    <div className="navigation bg-white flex items-center justify-between py-3 px-6">
      {/* Logo Section */}
      <div className="flex items-center gap-6">
        <img
          src="src\\assets\\logo.png"
          alt="Logo"
          className="h-24 w-24 object-contain"
        />
      </div>
      {/* Button Section */}
      <div className="flex items-center gap-8">
        {/* Publish Ride Button */}
        <button className="flex text-xl items-center gap-4 bg-purple-800 text-white px-6 py-3 rounded-lg shadow-md hover:bg-purple-500">
          <LuCirclePlus className="text-3xl" />
          Publish Ride
        </button>
        {/* Account Dropdown */}
        <div className="relative text-3xl">
          <button
            ref={accountButtonRef}
            onClick={toggleDropdown}
            className="text-purple-900 flex items-center gap-3 focus:outline-none"
          >
            <FaUserCircle className="text-3xl" />
            <span>Account</span>
            <i className="fas fa-chevron-down"></i>
          </button>
          {isDropdownOpen && (
            <div
              ref={dropdownRef}
              className="absolute bg-white text-gray-700 mt-2 py-2 w-40 rounded-lg shadow-lg"
            >
              <a href="/login" className="block px-4 py-2 hover:bg-gray-200">
                Login
              </a>
              <a href="/signup" className="block px-4 py-2 hover:bg-gray-200">
                Sign Up
              </a>
            </div>
          )}
        </div>
      </div>
    </div>
  );
};

export default Navigation;
