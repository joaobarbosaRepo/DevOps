import random
print("********************************")
print("Bem vindo jogo de advinhacao!!!")
print("********************************")
numero_secreto= random.randrange(1,101)
total_de_tentativas=0
print("Qual nível de dificuldade?")
print( "(1)Fácil (2)médio  (3)Difícil ")
nivel= int(input("Digite o nível: "))
if(nivel==1):
 total_de_tentativas=20
elif(nivel == 2):
 total_de_tentativas=10
else:
    total_de_tentativas= 5
    



for rodada in range(1,total_de_tentativas+1):
 print("Tentativas {} de {}".format(rodada,total_de_tentativas))
 chute= int(input("Digite o seu número de 1 até 100:"))
 print("Você digitou:", chute)
 if(chute<1 or chute>100):
    print("digite um número ente 1 e 100!!")
    continue

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
