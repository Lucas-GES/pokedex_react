import { Link } from 'react-router-dom';
import '../Card/styles.css';

import { BASE_URL } from "../../utils/requests";
import axios from 'axios';
import { useEffect, useState } from "react";
import { Region } from "../../types/region";

function Card() {

    const [region, setRegion] = useState<Region[]>([]);

    useEffect(() => {
        axios.get(`${BASE_URL}/region`)
            .then(response => {
                console.log(response.data);
                setRegion(response.data);
            })
    }, []);

    return (
        
        <div className='row list-of-cards'>
            {region.map(rg => {
                return (
                    <div key={rg.id} className="col-sm-4">
                        <Link to={`/pokemons/${rg.id}`} state = {rg.id} >
                            <div className="card">
                                <img src={`${rg.img}`} className="card-img-top" alt="..." />
                            </div>
                        </Link>
                    </div>
                )
            })}
        </div>
    );
}

export default Card;
