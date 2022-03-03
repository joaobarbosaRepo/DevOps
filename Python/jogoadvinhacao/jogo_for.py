


print("********************************")
print("Bem vindo jogo de advinhacao!!!")
print("********************************")
numero_secreto= 7
total_de_tentativas=3

for rodada in range(1,total_de_tentativas+1):
 print("Tentativas {} de {}".format(rodada,total_de_tentativas))
 chute= int(input("Digite o seu número:"))
 print("Você digitou:", chute)
 acertou= numero_secreto==chute
 menor_numero_secreto=chute<numero_secreto
 maior_numero_secreto=chute>numero_secreto
 if(acertou):
     print("Você acertou")
     break
 else:
    if(maior_numero_secreto):
      print("Você errou, digitou um número maior ")
    if(menor_numero_secreto):
       print("você errou, digitou um número  menor. ")


print("Fim do jogo")       

