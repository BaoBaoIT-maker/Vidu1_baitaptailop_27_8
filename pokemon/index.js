
fetchdata();


async function fetchdata() {
    try{
        const pokemonname=document.getElementById("pokemonname").value.toLowerCase();
        const response= await fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonname}`);
        if(!response.ok)
            throw new Error("Could not fetch the resource!");
        const data= await response.json();
        const pokemonSprite=data.sprites.front_default;
        const imgpokemon=document.getElementById("pokemonSprite");
        imgpokemon.src=pokemonSprite;
        imgpokemon.style.display="block";
        console.log(data);
    }
    catch(error){
        console.log(error);
    }
}