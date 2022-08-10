import { Link } from 'react-router-dom';
import '../HomePokedex/styles.css';

function HomePokedex() {
    return (
        <div className="home-container">
            <h1>Web Pokedex</h1>
            <img src={require("../../assets/img/pokedex.png")} alt="Pokedex" />
            <Link to={`/regions`}>
                <button type='button'>Enter</button>
            </Link>
        </div>
    );
}

export default HomePokedex;
