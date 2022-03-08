package com.example.demo.client;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class CadastroClientTest {
	public void testeUnitario() throws IOException {
	OkHttpClient client = new OkHttpClient().newBuilder()
			  .build();
			MediaType mediaType = MediaType.parse("application/json");
			RequestBody body = RequestBody.create(mediaType, "{\r\n    \"email\": \"fulano@gmail.com\",\r\n    \"senha\": \"123\"\r\n}");
			Request request = new Request.Builder()
			  .url("localhost:8082/cliente/cadastro")
			  .method("POST", body)
			  .addHeader("Content-Type", "application/json")
			  .build();
			Response response = client.newCall(request).execute();

	}
}
