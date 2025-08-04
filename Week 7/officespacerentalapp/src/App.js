import React from 'react';
import './App.css';

const offices = [
  { Name: 'DBS', Rent: 50000, Address: 'Chennai', img: 'office.jpg' },
  { Name: 'Regus', Rent: 65000, Address: 'Bangalore', img: 'office.jpg' },
  { Name: 'SmartWorks', Rent: 45000, Address: 'Hyderabad', img: 'office.jpg' }
];

function App() {
  return (
    <div>
      <h1>Office Space, at Affordable Range</h1>
      {offices.map((item, index) => {
        const rentClass = item.Rent <= 60000 ? 'textRed' : 'textGreen';

        return (
          <div key={index}>
            <img src={item.img} alt="Office Space" width="25%" height="25%" />
            <h2>Name: {item.Name}</h2>
            <h3 className={rentClass}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
            <hr />
          </div>
        );
      })}
    </div>
  );
}

export default App;
