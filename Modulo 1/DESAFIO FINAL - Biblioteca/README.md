# CALCULADORA

1. Tipos primitivos (Char, Byte, Boolean, Float, Double, Int, Long, Short) e String são aceitos. Retorna um float.
   <br>1.1. Boolean é interpretado como 1 para true e 0 para false.
   <br>1.2. Char é interpretado como o valor numérico na tabela ASCII.

2. Os métodos `somar()`, `multiplicar()`, `subtrair()` e `dividir()` aceitam qualquer quantidade de números maior que 0.

3. Os métodos `raioCirculo()` e `diametroCirculo()` recebem apenas um parâmetro, sendo respectivamente o raio ou diâmetro do círculo para o cálculo da área.

4. Os métodos `areaRetangulo()` e `areaTriangulo()` recebem dois parâmetros, sendo a altura e largura.

5. O método `areaQuadrado()` recebe apenas um parâmetro, sendo o tamanho de um lado.

6. O método `perimetro()` recebe dois parâmetros, sendo a quantidade de lados e tamanho de um dos lados, ou mais valores sendo a medida de cada lado. Se menos de dois parâmetros forem passados, retornará 0.

7. O método `volumeCilindro()` recebe três parâmetros, sendo o raio e altura.

8. O método `volume()` recebe três parâmetros, sendo a largura, altura e profundidade.

9. Os métodos `juroSimples()` e `jurosCompostos()` recebem três parâmetros, sendo capital, taxa e tempo.

10. O método `potencializar()` recebe dois parâmetros, sendo a base e o expoente.

| Método             | Quantidade de Parâmetros | Parâmetros                             | Exemplo de Chamada        |
|--------------------|-------------------------|----------------------------------------|---------------------------|
| Somar              | > 1                     | somar(numeros)                         | somar('1', 5.8, "7")      |
| Multiplicar        | > 1                     | multiplicar(numeros)                   | multiplicar(0, '5')       |
| Subtrair           | > 1                     | subtrair(numeros)                      | subtrair("6", 8, 0)       |
| Dividir            | > 1                     | dividir(numeros)                       | dividir(9, 6, 7.6)        |
| Raio Circulo       | 1                       | raioCirculo(raio)                      | raioCirculo(7)           |
| Diâmetro Circulo   | 1                       | diametroCirculo(diametro)              | diametroCirculo(5)       |
| Área Retângulo     | 2                       | areaRetangulo(altura, largura)         | areaRetangulo(8, "6")    |
| Área Triângulo     | 2                       | areaTriangulo(altura, largura)         | areaTriangulo(5, 4.5)    |
| Área Quadrado      | 1                       | areaQuadrado(lado)                     | areaQuadrado('b')        |
| Perímetro          | 2                       | perimetro(quantidade, lado)            | perimetro(7, 4)          |
| Perímetro          | > 2                     | perimetro(lados)                       | perimetro(1, 2, 3)       |
| Perímetro          | < 2                     | perimetro()                           | return 0                 |
| Volume             | 3                       | volume(largura, altura, profundidade)  | volume('a', 'b', 'c')    |
| Volume Cilindro    | 2                       | volumeCilindro(raio, altura)           | volumeCilindro(4.5, 8)   |
| Juros Simples      | 3                       | juroSimples(capital, taxa, tempo)      | juroSimples("1500", 0.9, 3.5)|
| Juros Compostos    | 3                       | jurosCompostos(capital, taxa, tempo)   | jurosCompostos("3000", 0.125, '!')|
| Potencializar      | 2                       | potencializar(base, expoente)          | potencializar(2, "3")    |



