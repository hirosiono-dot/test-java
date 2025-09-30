# APIエンドポイント
- GET / - ウェルカムメッセージ
- GET /hello?name=YourName - 挨拶
- GET /health - ヘルスチェック
- GET /actuator/health - SpringActuatorヘルスチェック

# ローカルでの実行
```
# ビルド
mvn clean pacage

# 実行
java -jar target/spring-boot-demo-1.0.0.jar

# または
mvn spring-boot:run
```

アプリケーションはhttp://localhost:8080で起動します。

