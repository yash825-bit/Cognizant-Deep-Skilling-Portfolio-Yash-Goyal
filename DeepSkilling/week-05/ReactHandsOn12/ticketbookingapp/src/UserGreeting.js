import React from "react";
import FlightDetails from "./FlightDetails";

function UserGreeting() {
  return (
    <div>
      <h1>Welcome User</h1>

      <FlightDetails />

      <br />

      <button>Book Ticket</button>
    </div>
  );
}

export default UserGreeting;
