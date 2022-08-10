import '../PokemonsListing/styles.css';

function PokemonsListing() {

    const pokemon = {
        id: 1,
        image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuBDo6rr7lkxnEqkWdK_9OG9H9G3V5jJEfobig4JFo&s",
        name: "Snorlax",
        regionId: 1,
        type: "Normal"
    };

    return (
        <div className='row list-of-cards'>
            <div className="col-sm-3">
                <div className="card">
                    <img src={pokemon.image} className="card-img-top" alt="..." />
                    <div className="card-body">
                        <h3 className="card-title">{pokemon.name}</h3>
                        <h5>Type: {pokemon.type}</h5>
                    </div>
                </div>
            </div>

            <div className="col-sm-3">
                <div className="card">
                    <img src={pokemon.image} className="card-img-top" alt="..." />
                    <div className="card-body">
                        <h3 className="card-title">{pokemon.name}</h3>
                        <h5>Type: {pokemon.type}</h5>
                    </div>
                </div>
            </div>
            <div className="col-sm-3">
                <div className="card">
                    <img src={pokemon.image} className="card-img-top" alt="..." />
                    <div className="card-body">
                        <h3 className="card-title">{pokemon.name}</h3>
                        <h5>Type: {pokemon.type}</h5>
                    </div>
                </div>
            </div>
            <div className="col-sm-3">
                <div className="card">
                    <img src={pokemon.image} className="card-img-top" alt="..." />
                    <div className="card-body">
                        <h3 className="card-title">{pokemon.name}</h3>
                        <h5>Type: {pokemon.type}</h5>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default PokemonsListing;
