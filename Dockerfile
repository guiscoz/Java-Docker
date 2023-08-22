FROM openjdk:latest

WORKDIR /app

COPY . /app

RUN javac Notas.java

CMD ["java", "Notas"]

# docker build -t nome-da-imagem .
# docker run -it --name nome-do-container --rm nome-da-imagem