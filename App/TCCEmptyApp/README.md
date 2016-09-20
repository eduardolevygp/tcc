# App Base

Para gerar um apk diretamente por linha de comando:
+ Se não tiver ainda a variável ANDROID_HOME do sdk do android, siga os [passos](https://spring.io/guides/gs/android/) para configurá-la
+ Vá até esta pasta e execute o comando:

```
./gradlew build
```

+ Os apks gerados estarão na pasta TCCEmptyApp/app/build/outputs/apk
+ Execute este arquivo no device para instalar o app