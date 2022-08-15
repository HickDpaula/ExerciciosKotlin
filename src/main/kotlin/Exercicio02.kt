fun main(){

    print("Qual o diâmetro do circulo?: ")
    var circulo = readln().toFloat()

    val raio = circulo/2
    val area = 3.14 * (raio*raio)
    val perimetro = (2 *3.14) * raio

    print ("A area do circulo é: $area e o perimetro é: $perimetro")
}

