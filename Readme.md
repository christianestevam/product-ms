Application
# Product-ms

## Endpoint
- BaseUrl: /products
- POST: create()
- GET: getAll()
- GET /{id}: getByid()
- PUT /{id}: update()
- DELETE /{id} delete()

## Model
```json
{
	"id": 1,
	"name": "Generic Phone"
	"description": "Phone"
	"price": 6999.9
	"isAvailable": true
}

## Business Rules
- Só é possível a criação de produtos com preço positivo;
- Não é possível pesquisar produtos que não estão disponiveis
- Não é possível inserir descrições com menos 50 caracteres
