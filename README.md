# spring-ai-ollama
Spring AI Ollama using Meta Llama Model

## Dev Setup.
1. Prerequisite: docker
2. Run `docker-compose up`
3. Run llama model `docker exec -it ollama ollama run llama3.1:8b`
4. Start the Spring Boot Application.

## Testing

1. Sample Request
```curl
    curl --location 'http://localhost:8080/api/v1/ai/chat/query' \
    --header 'Content-Type: application/json' \
    --data '{
    "message": "tell me a joke"
    }'
```
