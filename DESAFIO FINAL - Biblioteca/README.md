# CALCULADORA 
1 - Os tipos primitivos (Char, Byte, Boolean, Float, Double, Int, Long, Short) e String são aceitos. Retorna um float.
    1.1 - Boolean, lida com true como 1  e false como 0. 
    1.2 - Char lida com o número respectivo na tabela ASCII. 
2 - Os metodos  `somar()`, `multiplicar()`, `subtrair()` e `dividir()` recebem qualquer quantidade de números maior que 0.
3 - Os métodos `raioCirculo()` e  `diametroCirculo()` recebe apenas um parametro sendo respectivamente o raio ou diametro do circulo para calculo da área. 
4 - Os métodos `areaRetangulo()` e `areaTriangulo()` recebem dois parametros sendo a altura e largura. 
5 - O método `areaQuadrado()` recebe apenas um parametro sendo o tamanho de um lado.
6 - O método `perimetro()` recebe dois parametros sendo a quantidade de lados e tamanho de um dos lados, ou mais valores sendo a medida de cada lado. Se menos de dois parametros forem passados retornará 0. 
7 - O método `volumeCilindro()` recebe três parametros sendo o raio e altura. 
8 - O método `volume()` recebe três parametros sendo a largura, altura e profundidade. 
9- Os métodos `juroSimples()` e `jurosCompostos()` recebem três parametros sendo capital, taxa e tempo. 
10 - O método `potencializar()` recebe dois parametros sendo a base e o expoente. 

| Método | Quantidade Parametros | Parametros| |
| Somar| > 1| somar(numeros)|somar('1',5.8,"7")|
| Multiplicar| > 1| multiplicar(numeros)|multiplicar(0,'5')|
| Subtrair| > 1| subtrair(numeros)|subtrair("6",8,0)|
| Dividir| > 1| dividir(numeros)|dividir(9,6,7.6f)|
| Raio Circulo| 1| somar(raio)|raioCirculo(7f)|
| Diametro Circulo| 1| diametroCirculo(diametro)|diametroCirculo(5)|
| Área Retangulo|2| areaRetangulo(altura, largura)|areaRetangulo(8,"6")|
| Área Triangulo|2| areaTriangulo(altura, largura)|areaTriangulo(5,4.5)|
| Área Quadrado|1| areaQuadrado(lado)|areaQuadrado('b')|
| Perimetro |2| perimetro(quantidade, lado)|perimetro(7,4)|
| Perimetro |>2| perimetro(lados)|perimetro(1,2,3)|
| Perimetro |<2| perimetro()|return 0|
| volume |3| volume(largura, altura, profundidade)|volume('a','b','c')|
| volumeCilindro|2| perimetro(raio, altura)|volumeCilindro(4.5,8)|
|Juros Simples|3| juroSimples(capital, taxa, tempo)|juroSimples("1500",0.9,3.5)|
|Juros Compostos|3| jurosCompostos(capital, taxa, tempo)|jurosCompostos("3000",0.125,'!')|
| Potencializar |2| potencializar(base, expoente)|potencializar(2,"3")|


