function confirmar(id){
	if(confirm("Deseja realmente apagar?")){
		location.href='deletar/'+id
	}
	
}