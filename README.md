
# LeadMentoringPetShopAPI
### Lead Mentoring PetShop tem como objetivo o gerenciamento de um Petshop, permitindo o cadastro de produtos e pets de cada petshop.
Essa API foi criada como avaliação final da Lead Mentoring.  
Mentor: <a href="https://github.com/CCastro01">Christian Castro</a>  


## Tech  
- Java  
- Spring Boot
- PostgreSQL  

## Exemplo:

Você pode ver esse projeto sendo colocado em prática:

- [LMPetshop](https://lmpetshop.vercel.app/login) - [Repository](https://github.com/jonathasltavares/LeadMentoringPetShop)
  

## API Reference  
- [Petshops](#petshopsA)
- [Produtos](#produtosA)
- [Pets](#petsA)
  
<a id="petshopsA"></a>
## Petshops 
#### Get all Petshops
```http
  GET /PetShop/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|  |  |  |

#### Get Petshop by ID

```http
  GET /PetShop/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `UUID` | **Required**.    |

#### Login

```http
  GET /PetShop/login?email=${email}&password=${password}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Email`      | `string` | **Required**. Email of Petshop |
| `Password`      | `string` | **Required**. Password of Petshop |

#### Post Petshops

```http
  POST /PetShop/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `PetShop` | `Object` | **Required**.  |

#### Put Petshops

```http
  PUT /PetShop/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `PetShop` | `Object` | **Required**.  |

#### Delete Petshop by ID

```http
  DELETE /PetShop/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `UUID` | **Required**.  |

<a id="produtosA"></a>
## Produtos  
#### Get all Products
```http
  GET /Product/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|  |  |  |

#### Get Product by ID

```http
  GET /Product/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `UUID` | **Required**.    |

#### Get Product by Petshop

```http
  GET /Product/petshop?id=${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `ID`      | `UUID` | **Required**. ID of Petshop |


#### Post Product

```http
  POST /Product/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Product` | `Object` | **Required**.  |

#### Put Petshops

```http
  PUT /Product/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Product` | `Object` | **Required**.  |

#### Delete Product by ID

```http
  DELETE /PetShop/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `UUID` | **Required**.  |  

<a id="petsA"></a>
## Pets  
#### Get all Pets
```http
  GET /Pet/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|  |  |  |

#### Get Pet by ID

```http
  GET /Pet/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `UUID` | **Required**.    |

#### Get Pet by Petshop

```http
  GET /Pet/petshop?id=${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `ID`      | `UUID` | **Required**. ID of Petshop |


#### Post Pet

```http
  POST /Pet/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Pet` | `Object` | **Required**.  |

#### Put Pet

```http
  PUT /Pet/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Pet` | `Object` | **Required**.  |

#### Delete Product by ID

```http
  DELETE /Pet/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `UUID` | **Required**.  |  

## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`DB_URL`

`DB_USER`

`DB_PASSWORD`

## Deploy

https://lmpetshopapi.herokuapp.com

