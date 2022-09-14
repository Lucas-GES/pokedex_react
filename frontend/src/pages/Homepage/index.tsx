import {
    BrowserRouter,
    Routes,
    Route,
  } from "react-router-dom";
import Card from '../../components/Card';
import HomePokedex from "../../components/HomePokedex";
import PokemonsListing from "../../components/PokemonsListing";

function Homepage() {

    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<HomePokedex/>} />
                <Route path="/regions" element={<Card />} />
                <Route path="/pokemons">
                    <Route path=":regionId" element={<PokemonsListing />} />
                </Route>
            </Routes>
        </BrowserRouter>
    );
}

export default Homepage;
