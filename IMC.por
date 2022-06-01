programa
{
	
	funcao inicio()
	{
		real m, h, imc
		cadeia msg
		escreva("Cálculo do IMC\n")
		escreva("Informe o peso (Kg): ")
		leia(m)
		escreva("Informe a altura (m): ")
		leia(h)
		imc = m / (h * h)
		msg = "\nResultado: "
		se(imc < 18.5)
		{
			msg += "Magreza "
			se(imc >= 17)
			{
				msg += "leve"
			}
			se(imc < 17 e imc >= 16)
			{
				msg += "moderada"
			}
			se(imc < 16)
			{
				msg += "severa"
			}
		}
		se(imc >= 18.5 e imc < 25)
		{
			msg += "Peso normal"
		}
		se(imc >= 25 e imc < 30)
		{
			msg += "Sobrepeso"
		}
		se(imc >= 30)
		{
			msg += "Obesidade "
			se(imc < 35)
			{
				msg += "classe I"
			}
			se(imc > 35 e imc < 40)
			{
				msg += "classe II"
			}
			se(imc >= 40)
			{
				msg += "classe III"
			}
		}
		escreva(msg, " - IMC = ", imc, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 790; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */