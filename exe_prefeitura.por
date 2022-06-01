programa
{
	
	funcao inicio()
	{
		real num, media, aux=0, filho, mediaf, maiorsal=0, salariomin=0, percent
		inteiro auxf=0, habit

		escreva("Digite o número de habitantes a serem analisados: ")
		leia(habit) //para controlar o número de habitantes na análise

		enquanto(habit <= 0){
			escreva("\nQuantidade inválida! Digite novamente: ")
			leia(habit)
		}

		para(inteiro controle = habit; controle > 0; controle--){

			
			
			escreva("\nDigite o salário do habitante ", controle, " : ")
			leia(num)	

			aux += num
			
			se(num >= maiorsal){
				maiorsal = num
			}senao {
				maiorsal = maiorsal
			}

			se(num <= 100){
				salariomin ++
			}

			escreva("Digite o número de filhos: ")
			leia(filho)

			auxf += filho
		}
		
		media = aux/habit
		mediaf = auxf/habit
		percent = (salariomin/habit)*100
		
		escreva("\nA média de salário é ", media)
		escreva("\nA média de filhos é ", mediaf)
		escreva("\nO maior salário é de R$ ", maiorsal)
		escreva("\nO percentual de pessoas com salário até R$100 é de ", percent, "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */