import axios from 'axios';
import { backend } from '../config'

/**
 * Hace un apicall al backend para obtener los posts.
 * 
 * @returns {Array<{ id: number, title: string, image: string, tag: string, date: string }>}
 */
function getPosts(){
  return axios
    .get(`${backend.baseUrl}/api/posts`)
    .then(response => response.data)
}

export { getPosts }