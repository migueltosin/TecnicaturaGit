# Clase 1 Git Bash
>Lo que vimos en la clase anterior:

Abrimos la terminal de Git Bash en Window o la terminal de Ubuntu, tambien la terminal de Mac, y comenzamos con los siguientes comandos y creación de directorios<br>

``` sh 

pwd  #Vemos la ruta de la carpeta en la que estamos

cd #Es para navegar a una carpeta: change directory -> cambiar de directorio

cd / #Nos llava al home, en la raíz del disco

cd ~ #La virgulilla significa que estamos en el lugar de los documentos o del usuario

ls #Esto es listar los archivos, nos muestra todos los archivos en la raíz

ls -al #El espacio -al significa que es un argumento especial para ver archivos ocultos

#Usar la flecha hacía arriba nos muestra el último comando utilizado

ls -l #Muestra casi todos los archivos sin los que están ocultos

ls -a #Muestra el grupo de archivos pero no en una lista

clear #Limpia la consola o ctrl + l

cd .. #Nos devuelve a la carpeta anterior

cd U + tab #Esto se usa para un autocompletado o para buscar una referencia

cd /D #Cambiamos de disco en window

df -h #Muestra todos los directorios en Ubuntu

cd /mnt/d #Cambia de directorio usando WSL Ubuntu en window



AHORA COMENZAMOS CON LA CREACIÓN DE CARPETAS

Lo vamos a hacer justos desde zoom

cd ..

cd ..

cd /mnt/c

cd ~ #Vamos a la raíz

mkdir Tecnicatura #Recordar que en window las mayúsculas no tienen relevancia, pero si en Linux

cd tecnicatura

mkdir Python

mkdir Java

mkdir JavaScript

Revisar y ejecutar cada comando, hacerlo como practica

Profesor Ariel Betancud

CLASE 2 
Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador


touch vacio.txt #Crea un archivo con su extención: ESCRIBIR DENTRO

ctrl + s #Guardamos lo que escribimos en el archivo

./ #Significa la carpeta actual

../ #Significa la carpeta anterior

cat vacio.txt #Vemos el contenido del archivo

history #Veremos la historia completa de los comandos que hemos utilizado

!72 + enter #Veremos el comando que utilizamos en ese número

history -c #Borramos todos los comando que se han ido guardando

rm vacio.txt #Borra el archivo seleccionado, ¡¡¡¡CUIDADO!!!!

rm --help #Muestra como funciona el comando


CREAR UN REPOSITORIO DE GIT Y HAZ TU PRIMER COMMIT

cd tecnicatura

mkdir class-git

cd class-git #Entramos en la carpeta que necesitamos trabajar

git init #Creamos un repositorio en la carpeta central, se crea el archivo .git

IMPORTANTE: SI YA ESTA CREADO EL REPOSITORIO NO SE DEBE VOLVER A PONER ESTE COMANDO

code .  #Abrimos VSC, el punto hace que se abra el archivo en el que estamos situados

ctrl + n #Creamos un archivo nuevo y escribimos en el, como lo hicimos antes

ctrl + s #Guardamos poniendo el nombre: historia.txt

git status #Vemos el estado del proyecto en tiempo real, esta en el área de trabajo

git add historia.txt #Enviamos el archivo al área de preparación

git status #Para ver el estado de cambios

git rm --cached historia.txt #Quitamos el archivo del área de preparación, cached significa que esta en memoria ram

git config #Tedremos la lista de como funciona la configuración

git config --list #Configuraciones por defecto, faltan cosas importantes

git config --list --show-origin #Veremos donde están las configuraciones guardadas

LAS CONFIGURACIONES SI ESTÁN HECHAS NO SE DEBEN HACER DE NUEVO

git config --global user.name "Ariel Betancud"

git config --global user.email "betancudariel@gmail.com" #El correo debe ser el mismo que usaremos en GitHub

git config --list #Ahora veremos que ya están todos los datos completos

git add . #Ingresamos todos los archivos al área de preparación (ram)

git commit -m "Mensaje importante del commit" #El primer commit esta hecho

code . #Hacemos cambios en el archivo y guardamos

git status #Hay cambios para commitear

git add .

git commit -m "Mi segundo commit"


git log historia.txt #Vemos toda la historia de este archivo, el número largo es el hash del commit

CLASE 4 MIÉRCOLES 6 DE MAYO DEL 2026
Analizar cambios en los archivos de tu proyecto Git parte 4

Ingresamos de la siguiente manera:

Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

cd tecnicatura

cd class-git

ls

touch historia.txt

code .

#Modificamos el archivo historia.txt colocando lo siguiente: Bienvenido     mi nombre es Ariel (coloca tu nombre)

ctrl + s

git status

git add .

git status

git commit #Sin agregar -m veremos que pasa, se abre el editor de texto vim


#Agregar mensaje y salir con

Esc #Presionamos Escape 

:wq! + enter #Y ya salimos si estamos en git bash con window

Esc + shift + z + z #Salimos del mensaje para el commit, en linux, esto anda en algunas terminales

#Agregamos otra línea de mensaje en historia.txt desde VSC: estoy estudiando programación

ctrl + s

git add .

git commit

#Se abre un editor de código basado en línea de comandos, editor de texto como VSC llamado vim

Esc + i #Para comenzar a escribir mensaje del commit, no suele ser necesario

ctrl + x #Para salir en linux

s + enter #Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux

git show #Vemos todos los cambios en el último commit

git log historia.txt #Vemos todos los commit

q #Para salir del registro de commits

#Copiamos un hash mas antiguo y otro reciente, ingresamos el siguiente comando

git diff hash_commit_numerico hash_commit_numerico #Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva

q #Para salir

cd ..

Clase 5 (+AYSO)
git ignore : Permite ignorar archivos pasados como argumentos. Por ej. git ignore archivo.py


git merge <nombre-de-rama-fuente> : Sirve para fusionar dos ramas distintas, para esto primero hay que pararse en la rama que va a recibir los cambios, por ejemplo primero hacer git switch main seguido de git merge auxiliar. Si la rama destino y fuente tuvieron commits por separado antes del merge, git hará el merge como un commit nuevo en vez de un fast-forward. Cuando se genera un conflicto, el archivo con el conflicto tendrá marcas (<<<<<<< ======= >>>>>>>) en forma de bloque y dentro el codigo con el problema. Para solucionar esto hay que borrar las marcas y modificar el codigo como mejor convenga, luego de eso hay que guardar el archivo y hacer git add archivo_con_el_problema.txt, luego se puede usar git merge --continue para finalizar el merge.
Opciones:

--continue : permite finalizar un merge una vez resueltos los conflictos manualmente, esta opción es preferible antes que hacer un git commit porque tiene más funcionalidades (verifica si hay un merge en proceso y avisa si dejaste algun conflicto o no guardaste los archivos)
--abort : Si el conflicto es muy complejo esta opción revierte el repositorio a como estaba antes de hacer el merge, util como boton de pánico en caso de un conflicto crítico

git tag <version> <hash_commit> : Permite crear punteros en el historial de commits, ej. git tag v1.0 <hash>
Opciones:

-a <version> -m "mensaje de etiqueta anotada" : ANNOTATED — le indica a git a crear una etiqueta anotada en vez de una ligera, la diferencia es que la ligera es un simple puntero a un commit sin información detallada, como si fuera una rama que no se mueve, mientras que una etiqueta anotada es un objeto completo e independiente dentro de git el cual guarda quién la creó y cuándo se creó. Pide si o si un mensaje si se usa esta opcion.
-d <version> : DELETE — elimina la etiqueta que le indiquemos como argumento, por ej. git tag -d version_2.4

git show : Por defecto sirve para visualizar detalles (adiciones, modificaciones o eliminaciones en cada archivo que fue modificado) linea por linea del último commit, pero en realidad sirve para ver detalles de cualquier objeto git (por ejemplo una tag anotada usando git show <version>)

git stash : Util para guardar temporalmente los cambios no confirmados (staged o no) para poder trabajar en otras ramas o realizar una tarea de emergencia.
Opciones (la mayoria no usa guión):

pop : Permite retomar el ultimo stash y lo elimina de la lista de stashes
push -m <mensaje> : Guarda un stash con un mensaje dado, util para identificar el stash
-u : UNTRACKED — El stash incluirá archivos nuevos no añadidos a git
list : Muestra la lista de stashes con sus numeros y mensajes si tienen
apply stash@{n} : Aplica un stash sin eliminarlo de la lista como hace pop
drop stash@{n} : Elimina un stash especifico con el numero de stash
clear : Elimina todos los stashes guardados
Clase 8
git clone <url-del-repo> : Permite descargar y copiar un repositorio remoto a tu espacio local

git push : Se usa para subir los cambios locales al repositorio remoto vinculado. Para el primer push se debe indicar la rama usando git push -u origin <rama> (-u es upstream, origin lo estableces con git remote).
Opciones:

--all : Sube todos los cambios de todas las ramas, no solo de la que estas parado
--tags : Le indicas al push que incluya TODAS las tags locales que no estén en el servidor, OJO no se puede combinar con --all en la misma linea, deben hacerse dos push por separado.
-f o --force : Si el servidor rechaza el push, se lo puede forzar con esta opción. Sobreescribe el remoto con tu local, se puede pisar progreso cuidado.
--force-with-lease : Preferible antes que -f, fuerza tu push al servidor sin borrar los cambios nuevos de otros.
origin --delete <rama> : Permite eliminar del servidor la rama pasada como argumento

git fetch origin : Se usa para SOLO descargar el historial más reciente del servidor, sin hacer cambios inmediatos a tu zona de trabajo, permite revisar los cambios o ramas nuevas que se han hecho antes de integrarlos localmente. Se diferencia de git pull ya que éste es la combinación de fetch + merge en un solo paso.
Opciones:

-p o --prune : Si se borraron ramas de forma remota, localmente las vas a seguir viendo. Usando esta opción esas ramas fantasmas se limpian.

git pull : Descarga e integra de inmediato los cambios en el servidor a tu espacio local. Es técnicamente la combinación de git fetch + git merge.
Opciones:

origin <rama> : Sirve para actualizar la rama en la que estas parado con los cambios del servidor

git shortlog : Muestra el nombre del usuario, la cantidad de commits al lado de su nombre y una lista de solo los mensajes de los commits

Clase 9
ssh-keygen -t ed25519 -C "<email>" : Permite generar una clave ssh guardandola por defecto en una carpeta oculta llamada .ssh en ~, el nombre del archivo por defecto depende de tu algoritmo, en este caso seria id_ed25519. Al crear la clave te pedirá dónde guardarla, presionar enter para dejar por defecto. Al igual que preguntará por una contraseña (y otra vez para confirmarla), esto se puede dejar en blanco si se quiere.
Opciones:

-t <algoritmo> : TYPE — Define el tipo de algoritmo criptográfico para crear la clave. El algoritmo ed25519 es el más seguro, moderno y eficiente actualmente. Aunque hay algunos sistemas que no soportan este algoritmo.
-C <email> : COMMENT — Agrega un comentario de texto dentro del archivo de la clave pública para identificar a qué cuenta o máquina le pertenece esa clave, comunmente va el mail.
-b <bits> : En caso de no poder usar ed25519 y tener que usar rsa esta opción define la longitud de la clave en bits, para asegurar la máxima seguridad usando rsa se debe hacer -b 4096.