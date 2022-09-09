import { Link } from 'react-router-dom';
import '../Card/styles.css';
import { BASE_URL } from "../../utils/requests";
import axios from 'axios';

function Card() {

    axios.get(`${BASE_URL}/region`)
        .then(response => {
            console.log(response.data);
        })

    return (
        <div className='row list-of-cards'>
            <div className="col-sm-3">
                <Link to={`/pokemons/1`}>
                    <div className="card">
                        <img src={require('../../assets/img/johto.png')} className="card-img-top" alt="..." />
                    </div>
                </Link>
            </div>
            <div className="col-sm-3">
                <div className="card">
                    <img src={require('../../assets/img/johto.png')} className="card-img-top" alt="..." />
                </div>
            </div>
            <div className="col-sm-3">
                <div className="card">
                    <img src={require('../../assets/img/johto.png')} className="card-img-top" alt="..." />
                </div>
            </div>

            <div className="col-sm-3">
                <div className="card">
                    <img src={require('../../assets/img/johto.png')} className="card-img-top" alt="..." />
                </div>
            </div>

            <div className="col-sm-3">
                <div className="card">
                    <img src={require('../../assets/img/johto.png')} className="card-img-top" alt="..." />
                </div>
            </div>
            <div className="col-sm-3">
                <div className="card">
                    <img src={require('../../assets/img/johto.png')} className="card-img-top" alt="..." />
                </div>
            </div>
            <div className="col-sm-3">
                <div className="card">
                    <img src={require('../../assets/img/johto.png')} className="card-img-top" alt="..." />
                </div>
            </div>

            <div className="col-sm-3">
                <div className="card">
                    <img src={require('../../assets/img/johto.png')} className="card-img-top" alt="..." />
                </div>
            </div>
        </div>
    );
}

export default Card;
