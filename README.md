#Hash

Fazer um programa que, a partir de uma chave inteira k, faça inserção, busca e remoção em uma tabela hash. O universo de chaves deve ser parâmetro configurável, assim como o tamanho da tabela hash. O programa deve interagir com o usuário, informando quando houve colisão e qual a ação adotada. Para pequenas instâncias, uma apresentação visual em tela deve ser utilizada. Parâmetros informados no início do programa pelo usuário: universo das chaves, tamanho da tabela e parâmetro do incremento (se for o caso).

O tratamento de colisões deve ser feito segundo as seguintes técncicas:
- Chaining. in progress -- complete
- Linear Probing. --complete
- Linear Probing fixed increment bidirecional. (Rennan) -- complete
- Double hashing. (Vinícius)
- Linear Probing duas direções.--complete
- Linear Probing fixed increment unidirecional. -- complete

Em todos os casos, na exclusão, não se pode usar a técnica de marcar a posição com "A" (Available), ou seja, tem que "arrumar" a tabela na hora da exclusão (ou remoção).
CASO JULGUEM NECESSÁRIO, PODE SIM. CONVERSEM COMIGO PARA DEFINIRMOS.

Na remoção, não se pode excluir todos de uma sequência e reincluir em seguida.
OBSERVAÇÃO: Diferente do que está no início deste texto, fazer antes um mapeamento da chave (string) para int k.
