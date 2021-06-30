# springboot-rest-api-greetings-response


# REST API GREETINGS

The REST API just say hi to you. Methods available in the API:

`GET /greetings/`
`PUT /greetings/`
`POST /greetings/`
`DELETE /greetings/`

### Request

Here are two examples to test with cURL. If you want to test all the API methods (without running the pipeline), use postman and the `postman_collection.json`
## Examples

`GET /greetings/`

    curl -i -H 'Accept: application/json' http://3.130.50.98:8080/greetings?name=Danilo

### Response

    HTTP/1.1 200
    Content-Type: application/json
    Content-Length: 36
    Date: Wed, 30 Jun 2021 17:46:54 GMT

    Hello, Danilo from devco. GET method


`POST /thing/`

    curl -i -H 'Accept: application/json' -d 'name=Danilo' http://3.130.50.98:8080/greetings

### Response

    HTTP/1.1 200
    Content-Type: application/json
    Content-Length: 36
    Date: Wed, 30 Jun 2021 17:52:01 GMT

    Hello, Danilo from devco. POST method
    
# Diagram

<iframe width="768" height="432" src="https://miro.com/app/live-embed/o9J_l84gFQM=/?moveToViewport=318,1584,1289,1687" frameBorder="0" scrolling="no" allowFullScreen></iframe>

