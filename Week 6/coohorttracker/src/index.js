import React from 'react';
import ReactDOM from 'react-dom/client'; // ✅ React 18 uses 'react-dom/client'
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

// ✅ createRoot instead of render
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

reportWebVitals();
