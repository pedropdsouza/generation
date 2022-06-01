programa
{

	inclua biblioteca Matematica-->mat	
	funcao inicio()
	{
		//Exercício 6 - Sistema de Idade do Nadador

		
		inteiro idade

		escreva("Digite sua idade: ")
		leia(idade)

		escreva("Você está na categoria: ")

		se(idade >= 5 e idade <= 7){
			
			escreva("Infantil A")	
		
		}senao se(idade >= 8 e idade <= 11){
			
			escreva("Infantil B")	
		
		}senao se(idade >= 12 e idade <= 13){
			
			escreva("Juvenil A")	
			
		}senao se(idade >= 14 e idade <= 17){

			escreva("Juvenil B")
			
		}senao se(idade >= 18){

			escreva("Adultos")
			
		}senao{
			
			escreva("Idade inválida ou não permitida")
						
		}
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