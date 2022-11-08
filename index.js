let centimetros = document.querySelector(".centimetros");
let kilogramos = document.querySelector(".kilogramos");
let resultado = document.getElementById("resultado");

const formulario = document.forms[0];

formulario.addEventListener("submit", (e) => {
	e.preventDefault();
	let estatura = (centimetros.value / 100) * (centimetros.value / 100);
	let peso = kilogramos.value;

	resultado.value = peso / estatura;
});

let peso = document.querySelector(".peso");
let dolar = document.querySelector(".dolar");
let conversor = document.querySelector(".conversor");

peso.addEventListener("keyup", () => {
	dolar.value = peso.value / 140;
	console.log("hola");
});

dolar.addEventListener("keyup", () => {
	peso.value = dolar.value * 140;
	console.log("chao");
});

let notas = [];

notas.push(
	{
		id: 1,
		titulo: "sacar la basura",
		texto: "mi mama me va a retar si no lo hago",
		realiza: false,
	},
	{
		id: 2,
		titulo: "terminar la task",
		texto: "nico me va a retar si no lo hago",
		realiza: false,
	}
);

let idGlobal = notas[1].id;

console.log(notas);

let containerNotas = document.querySelector(".containerNotas");
let fragment = document.createDocumentFragment();
notas.forEach((element) => {
	let div = document.createElement("div");
	div.classList.add("card");
	div.innerHTML = `<div class="card-body">
						<div class="cardHead bg-light">
							<h5 class="card-title">${element.titulo}</h5>
						</div>

						<p class="card-text">${element.texto}</p>
						<a href="#" class="btn btn-danger">Borrar Nota</a>
					</div>`;
	fragment.appendChild(div);
});
containerNotas.appendChild(fragment);
