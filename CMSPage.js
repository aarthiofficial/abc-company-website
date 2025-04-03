import React, { useState } from "react";
import axios from "axios";

function CMSPage({ setHeading }) {
  const [newHeading, setNewHeading] = useState("");

  const updateHeading = () => {
    axios.post("http://localhost:8080/api/headings", { text: newHeading })
      .then(response => setHeading(response.data.text))
      .catch(error => console.error("Error updating heading:", error));
  };

  return (
    <div>
      <input
        type="text"
        placeholder="Enter new heading"
        value={newHeading}
        onChange={(e) => setNewHeading(e.target.value)}
      />
      <button onClick={updateHeading}>Update Heading</button>
    </div>
  );
}

export default CMSPage;
