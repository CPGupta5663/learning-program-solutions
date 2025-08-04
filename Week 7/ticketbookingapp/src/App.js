// src/App.js
import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      {isLoggedIn ? (
        <>
          <UserPage />
          <LogoutButton onClick={handleLogout} />
        </>
      ) : (
        <>
          <GuestPage />
          <LoginButton onClick={handleLogin} />
        </>
      )}
    </div>
  );
}

function LoginButton(props) {
  return <button onClick={props.onClick}>Login</button>;
}

function LogoutButton(props) {
  return <button onClick={props.onClick}>Logout</button>;
}

export default App;
