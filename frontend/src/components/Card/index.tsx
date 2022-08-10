import { Link } from 'react-router-dom';
import '../Card/styles.css';

function Card() {
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
