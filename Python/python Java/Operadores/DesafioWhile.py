nota = 0
sumNotes = 0
numberNotes = 0


while (nota != (-1)):
    print(f"Nota do {numberNotes +1}° aluno  (-1 para sair): ")
    nota = int(input())
    if (nota != -1 and nota <= 10):
        sumNotes = sumNotes + nota;
        numberNotes = numberNotes +1

    elif (nota != -1 or nota > 10):
        print("Digite um valor válido\n\n")

print(sumNotes / numberNotes)
    