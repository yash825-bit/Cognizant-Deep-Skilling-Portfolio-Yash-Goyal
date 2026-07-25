import { CalculateScore } from "./components/CalculateScore";
import "./App.css";

function App() {
  return (
    <div>
      <CalculateScore
        Name={"Yash Goyal"}
        School={"RSPS"}
        total={789}
        goal={7}
      />
    </div>
  );
}

export default App;
