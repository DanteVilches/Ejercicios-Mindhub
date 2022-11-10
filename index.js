let centimetros = document.querySelector(".centimetros");
let kilogramos = document.querySelector(".kilogramos");
let resultado = document.getElementById("resultado");
let guardar = document.querySelector(".btn-success");
let borrar = document.querySelector(".btn-danger");
let inputTitulo = document.querySelector(".titulo");
let inputTexto = document.querySelector(".textoNota");
const formulario = document.forms[0];

formulario.addEventListener("submit", (e) => {
	e.preventDefault();
	let estatura = (centimetros.value / 100) * (centimetros.value / 100);
	let peso = kilogramos.value;

	resultado.value = (peso / estatura).toFixed(2);
});

let peso = document.querySelector(".peso");
let dolar = document.querySelector(".dolar");

peso.addEventListener("keyup", () => {
	dolar.value = peso.value / 140;
});

dolar.addEventListener("keyup", () => {
	peso.value = dolar.value * 140;
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

let containerNotas = document.querySelector(".containerNotas");
let fragment = document.createDocumentFragment();

function imprimirNota(array) {
	containerNotas.innerHTML = "";
	array.forEach((element) => {
		let div = document.createElement("div");
		div.classList.add("card");
		div.innerHTML += `<div class="card-body">
						<div class="cardHead bg-light">
							<h5 class="card-title">${element.titulo}</h5>
						</div>

						<p class="card-text">${element.texto}</p>
						<a href="#" class="btn btn-danger close" onclick=borrarNota(${element.id})>Borrar Nota</a>
					</div>`;
		fragment.appendChild(div);
	});
	containerNotas.appendChild(fragment);
}
imprimirNota(notas);

function agregarNota(newTitulo, newTexto) {
	notas.push({
		id: notas.length + 1,
		titulo: newTitulo,
		texto: newTexto,
	});
}

guardar.addEventListener("click", (e) => {
	e.preventDefault();
	if (
		!inputTexto.value.trim().length == 0 &&
		!inputTitulo.value.trim().length == 0
	) {
		agregarNota(inputTitulo.value.trim(), inputTexto.value.trim());
		imprimirNota(notas);
	}
});

function borrarNota(id) {}
