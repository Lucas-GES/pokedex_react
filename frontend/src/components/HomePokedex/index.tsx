import '../HomePokedex/styles.css';

function HomePokedex() {
    return (
        <div className="home-container">
            <h1>Web Pokedex</h1>
            <img src={require("../../assets/img/pokedex.png")} alt="Pokedex" />
            <a href='/regions' type='button'>Enter</a>
        </div>
    );
}

export default HomePokedex;
