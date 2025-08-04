// src/GuestPage.js
import React from 'react';

function GuestPage() {
  return (
    <div>
      <h2>Please sign up.</h2>
      <FlightDetails />
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

export default GuestPage;
