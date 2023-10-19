# pip install requests no terminal
import requests

if __name__ == "__main__":
    body = {
        "name" : "pen",
        "description" : "black pen",
        "price": 2.5 
    }

    body2 = {
        "name" : "pencil",
        "description" : "blue pen",
        "price": 2 
    }

    excluir = {
        "name" : "pen"
    }
    #response = requests.post("http://localhost:8080/products", body)
    #response2 = requests.post("http://localhost:8080/products", body2)
    # response = requests.delete("http://localhost:8080/products", excluir)

    response3 = requests.get("http://localhost:8080/products/pen")
    print(response3.text)
    
