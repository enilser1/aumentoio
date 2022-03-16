# Challenge Frontend

## Requerimientos

Armar una web donde se vean los post de la misma manera que en la imagen adjunta y lleven a la web del post, que lo único que tiene que hacer es mostrar el post con el mismo componente que se usa en la web anterior, sin nada mas.

![posts](https://user-images.githubusercontent.com/8606443/139521432-cde0d275-370c-4243-b151-9f8b984cfa4c.png)

## Propuesta

En la propuesta se detallan las carateristicas de la pagina:

- Diseño responsivo (mobile first)
- Controlar los errores 404 y 500
- Se agregó una lógica para que el backend falle (seudo) aleatoriamente
- Documentacion en este readme
- Repositorio en Github
- Deploy en Heroku

A continuacion se muestra un grafico que diseñe para bajar los requerimientos "a papel":

> Las cosas que figuran como "opcionales" son ideas para completar la experiencia original.

![propuesta](https://user-images.githubusercontent.com/8606443/139521391-98f338ab-8e46-4ff2-b43d-e8356b217d65.png)

## Capturas de pantalla

Se adjuntan capturas para:

- Caso feliz en mobile
- Caso feliz en desktop
- Pantalla de error 404
- Pantalla de error 500

> Todas las capturas corresponden al unico endpoint definido: GET /posts

<details>
<summary>MOBILE - Caso feliz</summary>

![caso feliz - mobile](https://user-images.githubusercontent.com/8606443/139521214-b6671a9a-789b-4a05-ac40-e84f8fc521bc.png)

</details>
<details>
<summary>DESKTOP - Caso feliz</summary>

![caso feliz - desktop](https://user-images.githubusercontent.com/8606443/139521191-9ce27fb8-2eb0-4708-9fad-e408c3849816.png)

</details>
<details>
<summary>DESKTOP - Pantalla de "not found"</summary>

![404 - desktop](https://user-images.githubusercontent.com/8606443/139521318-9667f513-8bbc-43a0-af46-d932efb87f00.png)

</details>
<details>
<summary>DESKTOP - Pantalla de "internal server error"</summary>

![500 - desktop](https://user-images.githubusercontent.com/8606443/139521192-27b21dad-7469-4901-a2d8-3cdf6dd80006.png)

</details>
<br>

## Scripts

Los scripts disponibles son:

- `yarn start`: levantar la app localmente
- `yarn test`: correr los tests
- `yarn build`: genera los archivos estaticos y los minifica, entre otras cosas.
- `yarn eject`: para ver la magia oculta en este boilerplate.

## Tests

Por cuestiones de tiempo, no pude realizar los test que queria hacer, ya que no estoy familiarizado con la lib `testing-library@react`.
Me hubiera justado hacer al menos tests de integracion para:

- el caso feliz
- un error de la api
- una direccion que no ruteamos
  Me hubiera gustado tambien hacer tests unitarios de snapshots para cada componente definido.

## Mejoras a futuro

### Velocidad de carga

Actualmente la app tarda en cargar las imágenes, en especial la primera vez. \
 Esto se puede mejorar, por ejemplo: usando thumbnails, usando imagenes de distintas resoluciones, con skeletons, entre otras cosas.

### Aspect Ratio

La API que elegi para obtener las imagenes carece de un estandar de ratio: cada imagen tiene un tamaño distinto de la anterior. \
 Mi decision de mostrar las imagenes con alto y ancho fijo, hizo que algunas imagenes se vean "mal".
Se puede mejorar definiendo un estandar para carga de imagenes.
