import {
    BrowserRouter,
    Routes,
    Route
  } from "react-router-dom";
import Card from '../../components/Card';
import HomePokedex from "../../components/HomePokedex";

function Homepage() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<HomePokedex/>} />
                <Route path="/regions" element={<Card />} />
            </Routes>
        </BrowserRouter>
    );
}

export default Homepage;
