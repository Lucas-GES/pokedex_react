import axios from 'axios';
import { useEffect, useState } from 'react';
import { useLocation } from 'react-router-dom';
import { Pokemon } from '../../types/pokemon';
import { BASE_URL } from '../../utils/requests';
import '../PokemonsListing/styles.css';


function PokemonsListing() {

    const location = useLocation();
    const data = location.state;

    const [pokemon, setRegion] = useState<Pokemon[]>([]);

    useEffect(() => {
        axios.get(`${BASE_URL}/pokemons/${data}`)
            .then(response => {
                setRegion(response.data);
                console.log(response.data);
            })
    }, [data]);

    return (
        <div className='row list-of-cards'>
            {pokemon.map(pk => {
                return (
                    <div key={pk.id} className="col-sm-3">
                        <div className="card">
                            <img className="card-img-top" src={`${pk.img}`} alt="..." />
                            <div className="card-body">
                                <h3 className="card-title">{pk.name}</h3>
                                <h5>Type: {pk.type}</h5>
                            </div>
                        </div>
                    </div>
                )
            })}
        </div>
    );
}

export default PokemonsListing;
