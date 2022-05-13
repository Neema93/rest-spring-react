import axios from "axios";
import React, { useEffect, useState } from "react";
export default function Home() {
    const [name, setName] = useState([]);
    useEffect(() => {
        axios.get(`http://localhost:8085/`)
          .then((response) => {
            console.log("data", response);
            setName(response.data);
          })
          .catch(error => {
            console.log("Error: " + error);
          })
      }, []);
    return(
<div>
    
    {name}
</div>
    );
}