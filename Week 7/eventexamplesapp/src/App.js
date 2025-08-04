// src/App.js
import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(prev => prev + 1);
  };

  const sayHello = () => {
    alert("Hello! Member1");
  };

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleSyntheticEvent = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>{count}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <button onClick={handleSyntheticEvent}>Click on me</button>
      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
