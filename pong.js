//variáveis da Bolinha
let xBolinha = 300;
let yBolinha = 200;
let diametro = 12;
let raio = diametro / 2;

//velocidade da Bolinha
let velocidadeXBolinha = 6;
let velocidadeYBolinha = 6;

//variáveis da Raquete 1
let xRaquete =  10;
let yRaquete = 150;
let raqueteComprimento = 10;
let raqueteAltura = 90;

//variáveis da Raquete 2 (Oponente)
let xRaquete2 = 585;
let yRaquete2 = 150;
let velocidadeY2;

let colidiu = false;

//placar do jogo
let meusPontos=0;
let pontosAdversario=0;

//sons do jogo
let ponto;
let raquetada;
let trilha;

let chanceDeErrar = 0;

function preload(){
  trilha = loadSound("trilha.mp3");
  ponto = loadSound("ponto.mp3");
  raquetada = loadSound("raquetada.mp3");
}


function setup() {
  createCanvas(600, 400);
  trilha.loop();
}

function draw() {
  background(0);
  mostraBolinha();
  movimentaBolinha();  
  verifColisaoBorda();
  mostraRaquete(xRaquete, yRaquete);
  mostraRaquete(xRaquete2, yRaquete2);
  //verificaColisaoRaquete();
  movimentaRaquete();
  movimentaRaquete2();
  colisaoRaquete(xRaquete, yRaquete);
  colisaoRaquete(xRaquete2, yRaquete2);
  incluiPlacar();
  marcaPonto();
}

function mostraBolinha(){ 
  circle (xBolinha,yBolinha,diametro);
} 

function movimentaBolinha(){
  xBolinha += velocidadeXBolinha;
  yBolinha += velocidadeYBolinha;
}

function verifColisaoBorda(){
    if (xBolinha + raio> width ||
      xBolinha - raio< 0){
    velocidadeXBolinha *= -1;
  }
    if (yBolinha + raio> height ||
      yBolinha - raio< 0){
    velocidadeYBolinha *= -1;
  }
} 

function mostraRaquete(x,y){ 
   rect (x, y, raqueteComprimento, raqueteAltura);
} 

function movimentaRaquete(){
  if (keyIsDown(UP_ARROW)){
    yRaquete-=10;
    }
    if (keyIsDown(DOWN_ARROW)){
    yRaquete+=10;
 }
}

/*function verificaColisaoRaquete(){
  if (xBolinha - raio < xRaquete + raqueteComprimento && yBolinha - raio < yRaquete + raqueteAltura && yBolinha + raio > yRaquete)
  {
    velocidadeXBolinha *= -1;
    raquetada.play();
  }
}
*/ 

function colisaoRaquete(x, y){
  colidiu = collideRectCircle (x, y, raqueteComprimento, raqueteAltura, xBolinha, yBolinha, raio);
  if (colidiu){
    velocidadeXBolinha *= -1;
    raquetada.play();
  }
}

function movimentaRaquete2(){
  velocidadeY2 = yBolinha - yRaquete2 - raqueteComprimento /2 -50;
  yRaquete2 += velocidadeY2 + chanceDeErrar;
  calculaChanceDeErrar() 
}

function incluiPlacar(){
  stroke(255);
  textSize(20);
  textAlign(CENTER);
  fill(color(255, 140, 0));
  rect(150,10,40,20);
  fill(255);
  text(meusPontos,170,26);
  fill(color(255, 140, 0));
  rect(450,10,40,20);
  fill(255);
  text(pontosAdversario, 470, 26);  
}

function marcaPonto(){
  if (xBolinha > 590){
    meusPontos += 1;
    ponto.play();
    }
  if (xBolinha < 3){
    pontosAdversario += 1;
    ponto.play();
  } 
}

function calculaChanceDeErrar(){
    if (pontosAdversario >= meusPontos) {
    chanceDeErrar += 1
    if (chanceDeErrar >= 39){
    chanceDeErrar = 40
    }
  } else {
    chanceDeErrar -= 1
    if (chanceDeErrar <= 35){
    chanceDeErrar = 35
    }
  }
}



