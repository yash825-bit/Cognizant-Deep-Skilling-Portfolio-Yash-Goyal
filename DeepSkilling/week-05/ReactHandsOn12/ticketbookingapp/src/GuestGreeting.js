import React from "react";
import FlightDetails from "./FlightDetails";

function GuestGreeting() {
  return (
    <div>
      <h1>Welcome Guest</h1>

      <FlightDetails />

      <br />

      <p>Please login to book tickets.</p>
    </div>
  );
}

export default GuestGreeting;
