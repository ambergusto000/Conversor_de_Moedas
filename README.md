# 💱 Conversor de Moedas com API em Tempo Real

Este projeto é um **conversor de moedas** em Java que interage com o usuário via **console** e realiza conversões de valores entre diferentes moedas utilizando uma **API de câmbio em tempo real**.

---

## 🚀 Funcionalidades

- Interface interativa no console
- Conversão de valores em tempo real
- Integração com API externa para obter taxas atualizadas
- Suporte a múltiplas moedas:
  - Dólar ↔ Peso Argentino
  - Dólar ↔ Real Brasileiro
  - Dólar ↔ Peso Colombiano

---

## 🛠️ Tecnologias Utilizadas

- Java 11+
- `HttpClient`, `HttpRequest`, `HttpResponse`
- Biblioteca [Gson](https://github.com/google/gson) para manipulação de JSON
- API de câmbio: [ExchangeRate API](https://www.exchangerate-api.com/) (ou similar)
- Lembre-se de alterar para a sua chave de API
---

## 📷 Demonstração

```bash
******************************************************
Seja bem-vindo/a ao Conversor de Moeda =]

1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileiro
4) Real brasileiro => Dólar
5) Dólar => Peso colombiano
6) Peso colombiano => Dólar
7) Sair
******************************************************
Escolha uma opção válida: 4
Digite o valor que deseja converter: 100

Valor 100.0 [BRL] corresponde ao valor final de >>> 18.93 [USD]
