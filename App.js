import React, { useEffect, useState } from "react";
import axios from "axios";
import CMSPage from "./CMSPage";

function App() {
  const [heading, setHeading] = useState("Loading...");

  useEffect(() => {
    axios.get("http://localhost:8080/api/headings/latest")
      .then(response => setHeading(response.data.text))
      .catch(error => console.error("Error fetching heading:", error));
  }, []);

  return (
    <div>
      <h1>{heading}</h1>
      <CMSPage setHeading={setHeading} />
    </div>
  );
}

export default App;
