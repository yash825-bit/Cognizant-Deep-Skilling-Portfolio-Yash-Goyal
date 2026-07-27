import React, { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello! Static Message");
  }

  function handleIncrement() {
    increment();
    sayHello();
  }

  function sayWelcome(message) {
    alert(message);
  }

  function syntheticEvent() {
    alert("I was clicked");
  }

  return (
    <div>
      <h2>Counter: {count}</h2>

      <button onClick={handleIncrement}>Increment</button>

      <button onClick={decrement}>Decrement</button>

      <br />
      <br />

      <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>

      <br />
      <br />

      <button onClick={syntheticEvent}>Synthetic Event</button>
    </div>
  );
}

export default Counter;
