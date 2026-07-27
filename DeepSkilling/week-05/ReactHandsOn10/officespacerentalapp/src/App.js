import React from "react";
import "./App.css";
import officeImage from "./office.jpg";

function App() {
  const office = {
    Name: "DBS Business Center",
    Rent: 55000,
    Address: "Bangalore",
  };

  const officeList = [
    {
      Name: "Regus",
      Rent: 45000,
      Address: "Hyderabad",
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore",
    },
    {
      Name: "SmartWorks",
      Rent: 65000,
      Address: "Pune",
    },
    {
      Name: "Awfis",
      Rent: 58000,
      Address: "Delhi",
    },
  ];

  return (
    <div className="App">
      <h1>Office Space Rental App</h1>

      <img src={officeImage} alt="Office Space" width="500" height="300" />

      <h2>Featured Office</h2>

      <p>
        <b>Name:</b> {office.Name}
      </p>

      <p
        style={{
          color: office.Rent < 60000 ? "red" : "green",
        }}
      >
        <b>Rent:</b> Rs. {office.Rent}
      </p>

      <p>
        <b>Address:</b> {office.Address}
      </p>

      <hr />

      <h2>Available Office Spaces</h2>

      {officeList.map((item, index) => (
        <div key={index}>
          <p>
            <b>Name:</b> {item.Name}
          </p>

          <p
            style={{
              color: item.Rent < 60000 ? "red" : "green",
            }}
          >
            <b>Rent:</b> Rs. {item.Rent}
          </p>

          <p>
            <b>Address:</b> {item.Address}
          </p>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;
