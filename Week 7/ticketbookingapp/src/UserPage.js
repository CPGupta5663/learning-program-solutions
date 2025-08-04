// src/UserPage.js
import React from 'react';

function UserPage() {
  const handleBooking = () => {
    alert('Your ticket has been booked successfully!');
  };

  return (
    <div>
      <h2>Welcome back</h2>
      <FlightDetails />
      <button onClick={handleBooking}>Book Ticket</button>
    </div>
  );
}

function FlightDetails() {
  return (
    <div>
      <h3>Flight Details:</h3>
      <ul style={{ listStyle: 'none' }}>
        <li>✈️ Air India - Delhi to Mumbai - ₹4500</li>
        <li>✈️ Indigo - Bangalore to Pune - ₹3200</li>
        <li>✈️ SpiceJet - Hyderabad to Chennai - ₹2800</li>
      </ul>
    </div>
  );
}

export default UserPage;
