qtd_transacoes = int(input('Informa a quantidade de transações: '))

valor_total = 0

for n_transacao in range(1, qtd_transacoes + 1, 1):
    valor = float(input('Por favor, informe a transação {}: '.format(n_transacao)))
    valor_total = valor_total + valor

media = valor_total / qtd_transacoes

print('Neste dia, foi gasto um total de R$ {}, com uma média de R$ {} por transação'.format(valor_total, media))